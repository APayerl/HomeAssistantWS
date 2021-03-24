package se.payerl.haws.types.Server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import se.payerl.haws.types.Result;
import se.payerl.haws.types.ServerTypes;

import java.util.ArrayList;
import java.util.List;

public class ResultMessage extends ServerMessage {
    private boolean success;
    private List<Result> results = new ArrayList<>();

    @JsonCreator
    public ResultMessage(@JsonProperty("id") int id,
                         @JsonProperty("success") boolean success,
                         @JsonProperty("results") List<Result> result) {
        super(ServerTypes.RESULT, id);
        this.success = success;
        this.results = result;
    }
    @JsonCreator
    public ResultMessage(@JsonProperty("id") int id,
                         @JsonProperty("success") boolean success,
                         @JsonProperty("results") Result result) {
        super(ServerTypes.RESULT, id);
        this.success = success;
        this.results.add(result);
    }

    public boolean getSuccess() {
        return this.success;
    }
    public Result getResult() {
        return this.results.get(0);
    }
    public List<Result> getResults() {
        return this.results;
    }
}