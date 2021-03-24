package se.payerl.haws.types.Server;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import se.payerl.haws.HomeAssistantWS;
import se.payerl.haws.types.Result;
import se.payerl.haws.types.ServerTypes;

import java.util.ArrayList;
import java.util.List;

public class ResultMessage extends ServerMessage {
    private Boolean success = null;
    private List<Result> result = null;

//    @JsonCreator
//    public ResultMessage(@JsonProperty("id") int id,
//                         @JsonProperty("success") boolean success,
//                         @JsonProperty("results") List<Result> result) {
//        super(ServerTypes.RESULT, id);
//        this.success = success;
//        this.results = result;
//    }
//    @JsonCreator
//    public ResultMessage(@JsonProperty("id") int id,
//                         @JsonProperty("success") boolean success,
//                         @JsonProperty("results") Result result) {
//        super(ServerTypes.RESULT, id);
//        this.success = success;
//        this.results.add(result);
//    }

    public boolean getSuccess() {
        return this.success;
    }
    public List<Result> getResult() {
        System.out.println("ResultMessage::getResult - " + this.result.size());
        if(this.result == null || this.result.size() == 0) {
            return null;
        } else {
            return this.result;
        }
    }

    public ResultMessage setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public ResultMessage setResult(Object results) {
        if(results instanceof List) {
            this.result = HomeAssistantWS.getJackson(true).convertValue((List) results, new TypeReference<List<Result>>() {});
        } else if(results instanceof Result) {
            this.result = new ArrayList<>();
            this.result.add((Result) results);
        } else {
            this.result = null;
        }
        return this;
    }
}