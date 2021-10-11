package com.days.moment.board.domain;

import com.days.moment.board.dto.BoardDTO;
import com.days.moment.common.dto.UploadResponseDTO;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class Board {

    private String tag, drawing, content ,bSelectLocation;
    private Long bNum, bPicCount;
    private LocalDateTime bRegDate, bModDate;
    private String memId;





    @Builder.Default
    private List<BoardAttach> attachList = new ArrayList<>();

    public BoardDTO getDTO() {
        BoardDTO boardDTO = BoardDTO.builder()
                .bNum(bNum)
                .tag(tag)
                .drawing(drawing)
                .content(content)
                .bRegDate(bRegDate)
                .bModDate(bModDate)
                .bSelectLocation(bSelectLocation)
                .memId(memId)
                .bPicCount(bPicCount)
                .build();

        List<UploadResponseDTO> uploadResponseDTOList = attachList.stream().map(attach -> {
            UploadResponseDTO uploadResponseDTO = UploadResponseDTO.builder()
                    .uuid(attach.getUuid())
                    .fileName(attach.getFileName())
                    .uploadPath(attach.getPath())
                    .image(attach.isImage())
                    .build();
            return uploadResponseDTO;
        }).collect(Collectors.toList());

        boardDTO.setFiles(uploadResponseDTOList);

        return boardDTO;
    }

    public void setBNum(Long bNum) {this.bNum = bNum;}

    public void addAttach(BoardAttach attach) {

        attachList.add(attach);

    }
}