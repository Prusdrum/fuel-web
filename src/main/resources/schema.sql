CREATE TABLE public.stations
(
    id character varying(45) NOT NULL,
    name character varying(256),
    location_lat double precision,
    location_lng double precision,
    PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
);

ALTER TABLE public.stations
    OWNER to admin;