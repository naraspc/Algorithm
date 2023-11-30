-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, "%Y-%m-%d") as DATE_OF_BIRTH from member_profile
    where TLNO is not null && GENDER = 'W' && DATE_OF_BIRTH like '%-03-%'  
    order by member_id asc