# SF_2025_12

## MySQL Database & User 설정

```sql
CREATE DATABASE springdb;

CREATE USER 'springdbuser'@'%' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON springdb.* TO 'springdbuser'@'%';

## table_board 테이블 생성
'''sql
create table table_board(
	bno int auto_increment primary,
    title varchar(500) not null,
    content varchar(2000) not null,
    writer varchar(50) not null,
    regdate timestamp default now(),
    updatedate timestamp default now(),
    delflag boolean default false
);
