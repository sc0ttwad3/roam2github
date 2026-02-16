
# Project Principles

- Volta: use the `volta` toolchain manager; this requires `volta run` before running executables.

## Project Structure & Module Organization

- Source: `src/` for modules; entry point `index.js` (CommonJS).
- Config: `config/` for defaults and schemas; secrets via `.env` (not committed).
- Tests: `test/` for test files; fixtures under `test/fixtures/`.
- Scripts and metadata live in `package.json`.

## Build, Test, and Development Commands

## Coding Style & Naming Conventions

- Indentation: 2 spaces; semicolons required; CommonJS modules.
- Naming: files `kebab-case.js`; exports `camelCase`; classes `PascalCase`.
- Lint/format: ESLint + Prettier. Example: `npx eslint .` and `npx prettier -w .`.

## Testing Guidelines

- Framework: Jest or Vitest; target ≥80% line coverage for new code.
- Place tests beside code or under `test/`; name `feature-name.test.js`.

## Commit & Pull Request Guidelines

- Commits: follow Conventional Commits, e.g., `feat(cli): add playlist export`.
- PRs: include a clear summary, motivation, CLI output/screenshot for , linked issues, and tests/docs updates.

## Security & Configuration Tips

- Never commit credentials. Use `.env` with `dotenv` and local OS keychain/config dir for tokens.

## Architecture Overview

- Flow: parse args → authenticate → call Spotify API → write JSON/CSV to `./output/`.
- Keep modules small and pure: `src/auth/`, `src/api/`, `src/commands/`, `src/io/`.

## Agent-Specific Instructions

- Ensure cross-platform support (use `path.join`, avoid Bash-only scripts).
- Prefer small, testable functions; document public APIs with JSDoc.
