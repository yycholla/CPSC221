{pkgs ? import <nixpkgs> {}}:
pkgs.mkShell {
  buildInputs = [
    pkgs.hello
    pkgs.openjdk11-bootstrap
  ];
}
