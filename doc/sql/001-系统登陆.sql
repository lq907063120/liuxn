drop table if exists cmsUser;

/*==============================================================*/
/* Table: cmsUser                                               */
/*==============================================================*/
create table cmsUser
(
   id                   int not null auto_increment comment '表唯一主键自增',
   vcloginname          varchar(32),
   vcloginpwd           varchar(32),
   datcreate            timestamp,
   datlasttime          timestamp,
   datupdate            timestamp,
   primary key (id)
);
