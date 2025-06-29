package network;

import java.io.Serializable;

public class Response implements Serializable {
    private final String message;
    private static final long serialVersionUID = 1L;
    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}