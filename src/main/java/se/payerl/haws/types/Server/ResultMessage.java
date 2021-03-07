package se.payerl.haws.types.Server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import se.payerl.haws.types.Result;
import se.payerl.haws.types.ServerTypes;

import java.util.List;

public class ResultMessage extends ServerMessage {
    private boolean success;
    private List<Result> result;

    @JsonCreator
    public ResultMessage(@JsonProperty("id") int id,
                         @JsonProperty("success") boolean success,
                         @JsonProperty("result") List<Result> result) {
        super(ServerTypes.RESULT, id);
        this.success = success;
        this.result = result;
    }

    public boolean getSuccess() {
        return this.success;
    }
    public List<Result> getResult() {
        return this.result;
    }
}