;	$Id: named.boot,v 1.3 1995/03/23 08:43:02 rgrimes Exp $
;	From: @(#)named.boot	5.1 (Berkeley) 6/30/90

; boot file for secondary name server
; Note that there should be one primary entry for each SOA record.

; example sortlist config:
; sortlist 128.3.0.0

directory	/etc/namedb

; type    domain		source host/file		backup file

cache     .							named.root
primary   0.0.127.IN-ADDR.ARPA	localhost.rev

; example secondary server config:
; secondary Berkeley.EDU	128.32.130.11 128.32.133.1	ucbhosts.bak
; secondary 32.128.IN-ADDR.ARPA	128.32.130.11 128.32.133.1	ucbhosts.rev.bak

; example primary server config:
; primary  Berkeley.EDU		ucbhosts
; primary  32.128.IN-ADDR.ARPA	ucbhosts.rev
