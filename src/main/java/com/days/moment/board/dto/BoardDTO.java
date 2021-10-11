package com.days.moment.board.dto;

import com.days.moment.board.domain.Board;
import com.days.moment.board.domain.BoardAttach;
import com.days.moment.common.dto.UploadResponseDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BoardDTO {

    private Long bNum;
    private Long bPicCount;
    private String content;
    private String tag;
    private String drawing;
    private LocalDateTime bRegDate;
    private LocalDateTime bModDate;
    private String bSelectLocation;
    private String memId;







    @Builder.Default
    private List<UploadResponseDTO> files = new ArrayList<>();

    public Board getDomain() {

        Board board = Board.builder()
                .bNum(bNum)
                .tag(tag)
                .content(content)
                .drawing(drawing)
                .bRegDate(bRegDate)
                .bModDate(bModDate)
                .bSelectLocation(bSelectLocation)
                .memId(memId)
                .bPicCount(bPicCount)
                .build();

        files.forEach(uploadResponseDTO -> {
            BoardAttach attach = BoardAttach.builder()
                    .fileName(uploadResponseDTO.getFileName())
                    .uuid(uploadResponseDTO.getUuid())
                    .image(uploadResponseDTO.isImage())
                    .path(uploadResponseDTO.getUploadPath())
                    .build();

            board.addAttach(attach);
        });


        return board;
    }
}