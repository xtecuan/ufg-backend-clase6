CREATE TABLE IF NOT EXISTS public.personas
(
    id_persona bigserial NOT NULL ,
    nombres character varying(100) COLLATE pg_catalog."default" NOT NULL,
    apellidos character varying(100) COLLATE pg_catalog."default" NOT NULL,
    sexo character varying(1) COLLATE pg_catalog."default" NOT NULL,
    email character varying(100) COLLATE pg_catalog."default",
    fecha_nacimiento date,
    CONSTRAINT personas_pk PRIMARY KEY (id_persona)
);
