# SF_2025_12

## MySQL Database & User 설정

```sql
CREATE DATABASE springdb;

CREATE USER 'springdbuser'@'%' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON springdb.* TO 'springdbuser'@'%';
