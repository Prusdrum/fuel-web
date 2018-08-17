CREATE TABLE public.stations
(
    id character varying(45) NOT NULL,
    name character varying(256),
    lat double precision,
    lng double precision,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);