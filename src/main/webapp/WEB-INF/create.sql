drop table member;
create table member(
	id number(7) constraint member_id_pk primary key,
	email varchar2(30) constraint member_email_nn not null,
	password varchar2(30) constraint member_password_nn not null,
	name varchar2(30) constraint member_name_nn not null,
	regdate date default sysdate
);

create sequence member_id_seq
	increment by 1
	start with 1
	minvalue 1
	maxvalue 99999999
	nocycle;

insert into member(id, email, password, name) 
values (member_id_seq.nextval, 'wkdgyfla97@naver.com', '1234', 'Jorim');
insert into member(id, email, password, name) 
values (member_id_seq.nextval, 'Hyehwa@naver.com', '1234', 'HyeHwa');

commit;