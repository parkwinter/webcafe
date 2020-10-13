package com.pr.project.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Reply {
    private int r_num;               //NUMBER,                 --pk
    private int r_b_num;             //NUMBER not null,        --fk
    private int r_ref;				 //NUMBER not null,
    private int r_level;             //NUMBER not null,
    private int r_step;              //NUMBER not null,    
    private String r_id;             //varchar2(10) not null,  --fk
    private String r_nick;           //varchar2(10) not null,
    private String r_content;        //varchar2(50) not null,
    private Date r_regdate;          //DATE default sysdate,
    private Date r_update;           //DATE default sysdate,
    private String r_ip;             //VARCHAR2(20) not null,
    private String r_del;            // CHAR(1) default 'n',
    //CONSTRAINT r_num_pk PRIMARY KEY (r_num),
    //FOREIGN KEY (r_b_num) REFERENCES board (b_num), 
    //FOREIGN KEY (r_id) REFERENCES user_info (user_id) 

}
