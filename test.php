<?php
$fp = stream_socket_client("tcp://www.baidu.com:80", $errno, $errstr, 30);
if (!$fp) {
    die("Unable to connect: $errstr ($errno)");
}

/* Turn on encryption for login phase */
stream_socket_enable_crypto($fp, true, STREAM_CRYPTO_METHOD_SSLv23_CLIENT);
fwrite($fp, "USER god\r\n");
fwrite($fp, "PASS secret\r\n");

/* Turn off encryption for the rest */
stream_socket_enable_crypto($fp, false);

while ($motd = fgets($fp)) {
    echo $motd;
}

fclose($fp);
?>
