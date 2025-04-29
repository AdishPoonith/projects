.class public abstract Lp9/a;
.super Lp9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lp9/a<",
        "TS;>;>",
        "Lp9/b<",
        "TS;>;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Li9/d;Li9/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp9/b;-><init>(Li9/d;Li9/c;)V

    return-void
.end method

.method public static e(Lp9/b$a;Li9/d;)Lp9/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lp9/b<",
            "TT;>;>(",
            "Lp9/b$a<",
            "TT;>;",
            "Li9/d;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Li9/c;->k:Li9/c;

    invoke-static {p0, p1, v0}, Lp9/a;->f(Lp9/b$a;Li9/d;Li9/c;)Lp9/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lp9/b$a;Li9/d;Li9/c;)Lp9/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lp9/b<",
            "TT;>;>(",
            "Lp9/b$a<",
            "TT;>;",
            "Li9/d;",
            "Li9/c;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lp9/c;->c:Li9/c$c;

    sget-object v1, Lp9/c$a;->l:Lp9/c$a;

    invoke-virtual {p2, v0, v1}, Li9/c;->q(Li9/c$c;Ljava/lang/Object;)Li9/c;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lp9/b$a;->a(Li9/d;Li9/c;)Lp9/b;

    move-result-object p0

    return-object p0
.end method
