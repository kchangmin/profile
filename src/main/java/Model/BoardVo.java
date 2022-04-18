package Model;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardVo {
    private int seq;
    public String name;
    public String title;
    public Date date;
}
