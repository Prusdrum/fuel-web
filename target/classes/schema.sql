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

CREATE TABLE public.price_records
(
	id bigserial NOT NULL,
	station_id bigserial NOT NULL,
	integer price,
	currency character varying(5),
	price_date TIMESTAMP WITH TIME ZONE,
	created_at TIMESTAMP WITH TIME ZONE,
	user_id bigserial
);
