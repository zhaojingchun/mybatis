-- auto-generated definition
use test;
create table user
(
  id   int auto_increment
    primary key comment '唯一主键',
  name varchar(100) not null comment '姓名',
  password varchar(100) not null comment '密码',
  create_time char(17) comment '创建时间'
) CHARACTER SET utf8 COLLATE utf8_general_ci;

-- init
insert into user (name, password) value ('luna', '123456');