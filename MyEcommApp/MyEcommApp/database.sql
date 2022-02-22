-- CREATING CUSTOMERS TABLE 
create table customers(customer_id varchar2(20) constraint pk_customer_id primary key , customer_name varchar2(50), customer_email varchar(50) unique, password varchar2(50) not null, phone_number varchar2(20), address varchar2(50), date_of_registration date default sysdate                         
);

CREATE SEQUENCE customers_id_seq;

CREATE OR REPLACE TRIGGER cust_tgr
    BEFORE INSERT
    ON customers
    FOR EACH ROW
BEGIN
    IF :NEW.customer_id IS NULL THEN
        SELECT 'C'||TRIM(TO_CHAR(customers_id_seq.NEXTVAL,'0000000')) INTO :NEW.customer_id FROM DUAL;
    END IF;
END;



----- CREATING CATEGORY TABLE
create table categories(category_id varchar2(20) constraint pk_category_id primary key, category_name varchar2(50));
CREATE SEQUENCE category_id_seq;

CREATE OR REPLACE TRIGGER cat_tgr
    BEFORE INSERT
    ON categories
    FOR EACH ROW
BEGIN
    IF :NEW.category_id IS NULL THEN
        SELECT 'CAT'||TO_CHAR(category_id_seq.NEXTVAL,'0000000') INTO :NEW.category_id FROM DUAL;
    END IF;
END;



----- CREATING PRODUCTS TABLE

create table products(product_id varchar2(20) constraint pk_product_id primary key , product_name varchar2(50), category_id varchar(20) not null , product_price number(12,2), product_image varchar2(20), product_available_qty varchar2(50),
                        constraint fk_category foreign key (category_id) references categories(category_id)
);

CREATE SEQUENCE product_id_seq;

CREATE OR REPLACE TRIGGER prod_tgr
    BEFORE INSERT
    ON products
    FOR EACH ROW
BEGIN
    IF :NEW.product_id IS NULL THEN
        SELECT 'P'||TO_CHAR(product_id_seq.NEXTVAL,'0000000') INTO :NEW.product_id FROM DUAL;
    END IF;
END;