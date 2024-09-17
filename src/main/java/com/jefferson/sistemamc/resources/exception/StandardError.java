package com.jefferson.sistemamc.resources.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StandardError {
    private Integer status;
    private String msg;
    private String timeStamp;

    public StandardError(Integer status, String msg, String timeStamp) {
        super();
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }
}

