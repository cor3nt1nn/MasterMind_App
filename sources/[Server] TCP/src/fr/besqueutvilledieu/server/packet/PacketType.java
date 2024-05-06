package fr.besqueutvilledieu.server.packet;

/*
 * PACKET USES: 
 * - WEAK ENCAPSULATION -> STRING INTO BUFFER (DATAGRAM PACKET)
 * - NAME OF PACKET = PacketType._____.toString();
 * 
 */
public enum PacketType {
	LOGIN, CUSTOM_MESSAGE, SETTINGS_GAME, LAUNCH_GAME, START_GAME, PLAY_CONTENT, WAIT_FOR_TURN, CONTINUE_GAME,
	CONFIRMATION_PACKET, END_CONNECTION;
}