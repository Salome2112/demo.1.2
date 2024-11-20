CREATE VIEW AS
SELECT
    a.id AS activity_id,
    c.id AS client_id,
    c.name AS client_name,
    a.activity_date,
    a.description,
    a.duration
FROM
    activity a
        JOIN
    client c
    ON
        a.client_id = c.id;
