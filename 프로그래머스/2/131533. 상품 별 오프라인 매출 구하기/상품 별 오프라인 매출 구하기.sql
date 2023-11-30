-- 코드를 입력하세요
SELECT p.PRODUCT_CODE as PRODUCT_CODE , SUM(P.price * o.SALES_AMOUNT)  as SALES
    from product p 
    inner join offline_sale o
    
    on O.product_id = p.product_id
    group by p.product_CODE
    Order by SALES desc, product_code asc
   