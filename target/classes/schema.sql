CREATE TABLE public.stations
(
    id bigserial NOT NULL,
    external_id character varying(45),
    name character varying(256),
    lat double precision,
    lng double precision,
    address character varying(256),
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);