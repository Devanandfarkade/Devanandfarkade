DROP DATABASE IF EXISTS vehicles_db;

 create database vehicles_db;

 create table customer(id int primary key auto_increment,name varchar(30),mobile varchar(12),email varchar (100),address varchar(100));

 insert into customer values(1,'David','9895607810','david@gmail.com','Pune');

insert into customer values(2,'Raj','9994717174','raj@gmail.com','Mumbai');

insert into customer values(3,'Sanket','7891007810','sanket@gmail.com','Satara');

insert into customer values(4,'Laxman','8845607890','laxman@gmail.com','Kolhapur');

insert into customer values(5,'Dhruva','9595857565','dhruva@gmail.com','Sambhaji Nagar');

insert into customer values(6,'Rani','78654507898','rani@gmail.com','Jalgoen');

insert into customer values(7,'James','9970139252','james@gmail.com','Nashik');

insert into customer values(8,'Lalita','9325280026','lalita@gmail.com','Chalisgoen');

insert into customer values(9,'Pooja','8759068778','pooja@gmail.com','Nagpur');

insert into customer values(10,'Nilesh','9876543210','nilesh@gmail.com','Kolhapur');

  create table vehicle(id int primary key Auto_increment,company varchar (30),model varchar (30));

  insert into vehicle values(1,'Honda','cb-unicorn');

insert into vehicle values(2,'Hero','splender');

insert into vehicle values(3,'Honda','activa');

insert into vehicle values(4,'Honda','shine125');

insert into vehicle values(5,'Yamaha','FZ160');

insert into vehicle values(6,'Hero','karizma');

insert into vehicle values(7,'Honda','Hornet');

insert into vehicle values(8,'TVS','jupiter');

insert into vehicle values(9,'TVS','apache160');

insert into vehicle values(10,'Bajaj','pulsar');

  create table customer_vehicles(vehicle_number varchar(10) primary key,customer_id int,vehicle_id int ,foreign key (customer_id)references customer(id)on delete cascade on update cascade,foreign key (vehicle_id)references vehicle(id)on delete cascade on update cascade);

  insert into customer_vehicles values('MH12HK4481',8,9);

insert into customer_vehicles values('MH09KV1234',10,4);

insert into customer_vehicles values('MH09OP5678',10,6);

insert into customer_vehicles values('MH15AB8814',7,1);

insert into customer_vehicles values('MH20',5,8);

insert into customer_vehicles values('MH11PD5161',3,2);

insert into customer_vehicles values('MH01TY8814',2,7);

insert into customer_vehicles values('MH01RM4141',2,10);

insert into customer_vehicles values('MH19PH6543',6,2);

insert into customer_vehicles values('MH31DS7890',9,8);

insert into customer_vehicles values('MH12SJ4161',1,7);

insert into customer_vehicles values('MH09OT0808',4,3);

insert into customer_vehicles values('MH11AD7878',3,5);


create table parts(id int primary key auto_increment,name varchar (50),description varchar (100),price decimal(10,2));

insert into parts values(1,'clutch','The clutch is a part of the transmission system next to the crankshaft',1000);

insert into parts values(2,'battery','The car battery is also an essential component of car as it provides the electricity to car',4600);

insert into parts values(3,'alternator','It provides energy the electrical components such as power steering systems,power windows',3000);

insert into parts values(4,'radiator','important part of the car engine’s cooling system,helps to drain out the excess heat from the engine',4000);

insert into parts values(5,'propeller shaft','The power is transferred to the wheels using the propeller shaft. It is also called a driveshaft.',5000);

insert into parts values(6,'axles','It is nothing but shafts,used to mount the wheels,two types namely, Front Axle and Rear Axle',8000);

insert into parts values(7,'timing belt','keep the engine intake and exhaust valves open and close simultaneously in time with the pistons',8000);


   CREATE TABLE service_requests(id INT PRIMARY KEY AUTO_INCREMENT,vehicle_number VARCHAR(10),request_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,bill_amount DECIMAL(10,2),foreign key (vehicle_number) REFERENCES customer_vehicles(vehicle_number) ON UPDATE CASCADE ON DELETE CASCADE);

    create table payments(id int primary key auto_increment,service_request_id int ,tx_date timestamp default current_timestamp,paid_amount decimal(8,2),foreign key (service_request_id)references service_requests(id) on update cascade on delete cascade);

    create table services(id int primary key auto_increment,type ENUM ('oil','maintenance'),oil_cost decimal(6,2),labour_charges decimal(6,2),total_cost decimal(7,2),remark varchar (100),service_request_id int,foreign key (service_request_id)references service_requests(id) on update cascade on delete cascade);

     create table serive_parts(service_id int ,part_id int,quantity int ,foreign key (service_id)references services(id) on update cascade on delete cascade,foreign key (part_id) references parts(id) on update cascade on delete cascade);
     
     commit;
