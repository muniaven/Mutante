package com.mercadolibre.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/mutant")
public class esMutante {

	@GET
	@Path("/ismutant")
	@Produces(MediaType.APPLICATION_JSON)
	public Response evaluaMutante() {
		String[] aux = { "ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG" };
		Dna dna = new Dna();
		dna.setDna(aux);
		return Response.status(Status.OK).entity(dna).type(MediaType.APPLICATION_JSON).build();
	}

	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML})
	public Response evaluaMutante(Dna dna) {
		try {
			String[] Auxdna = new String[dna.getDna().length];
			System.arraycopy(dna.getDna(), 0, Auxdna, 0, dna.getDna().length);
			System.out.print(dna.getDna());
			if (ValidDna.isValidDna(Auxdna)) {

				if (Mutant.isMutant(Auxdna)) {
					return Response.status(Status.OK).entity(dna).type(MediaType.APPLICATION_JSON).build();
				} else {
					return Response.status(Status.FORBIDDEN).entity(dna).type(MediaType.APPLICATION_JSON).build();
				}

			} else {
				System.out.print("nO ES VALIDO");
				return Response.status(Status.BAD_REQUEST).entity(dna).type(MediaType.APPLICATION_JSON).build();
			}

		} catch (RuntimeException e) {
			System.out.print(e);
			return Response.status(Status.BAD_REQUEST).entity(dna).type(MediaType.APPLICATION_JSON).build();
		}
	}
}
