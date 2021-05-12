insert into tms.departments (deptid, accesslevel, name, sub_department)
values (1, 1, "user", "user");
insert into tms.departments (deptid, accesslevel, name, sub_department)
values (2, 2, "engineer", "System");
insert into tms.departments (deptid, accesslevel, name, sub_department)
values (3, 2, "engineer", "Application");
insert into tms.departments (deptid, accesslevel, name, sub_department)
values (4, 2, "engineer", "Database");
insert into tms.departments (deptid, accesslevel, name, sub_department)
values (5, 3, "admin", "admin");
insert into tms.departments (deptid, accesslevel, name, sub_department)
values (6, 2, "engineer", "AWS");


insert into tms.users (uid, name, password, department_id)
values (1, "Abhijeet", "Gulhane", 3);
insert into tms.users (uid, name, password, department_id)
values (2, "Aditi", "Nayak", 2);
insert into tms.users (uid, name, password, department_id)
values (3, "Akshay", "Kool", 1);
insert into tms.users (uid, name, password, department_id)
values (4, "Test123", "Test1123", 1);
insert into tms.users (uid, name, password, department_id)
values (5, "Test1234", "Test123123", 1);


insert into tms.tickets (tid, description, status, timestamp, user_id, assignee_id, solution, priority)
values (1, "First ticket", "new", "05/07/2021 20:37:00" ,3,2, "", "high");
insert into tms.tickets (tid, description, status, timestamp, user_id, assignee_id, solution, priority)
values (2, "User logged out of account", "In Progress", "05/07/2021 20:37:00" ,2,1, "", "medium");




insert into tms.users (uid, name, password, department_id)
values (101, "TestUser1", "test", 4);
insert into tms.users (uid, name, password, department_id)
values (102, "TestUser2", "test", 5);


insert into tms.departments (deptid, accesslevel, name, sub_department)
values (101, 4, "TestDept", "TEST");


insert into tms.tickets (tid, description, status, timestamp, user_id, assignee_id, solution, priority)
values (101, "TestTicket1", "Closed", "05/08/2021 20:37:00" ,4,2, "Cannot resolve", "low");
insert into tms.tickets (tid, description, status, timestamp, user_id, assignee_id, solution, priority)
values (102, "TestTicket2", "New", "05/08/2021 20:37:00" ,5,1, "resolved. granted", "medium");

