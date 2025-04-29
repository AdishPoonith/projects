.class public Lj6/e1;
.super Lj6/x0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj6/x0;-><init>()V

    return-void
.end method


# virtual methods
.method protected c(Lj6/j$a;)Ll6/f4;
    .locals 2

    invoke-virtual {p0}, Lj6/j;->n()Ll6/e1;

    move-result-object v0

    check-cast v0, Ll6/z2;

    invoke-virtual {v0}, Ll6/z2;->z()Ll6/h2;

    move-result-object v0

    invoke-interface {v0}, Ll6/k0;->i()Ll6/o0;

    move-result-object v0

    invoke-virtual {p1}, Lj6/j$a;->a()Lq6/g;

    move-result-object p1

    invoke-virtual {p0}, Lj6/j;->m()Ll6/i0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll6/o0;->j(Lq6/g;Ll6/i0;)Ll6/o0$a;

    move-result-object p1

    return-object p1
.end method

.method protected d(Lj6/j$a;)Ll6/k;
    .locals 3

    new-instance v0, Ll6/k;

    invoke-virtual {p0}, Lj6/j;->n()Ll6/e1;

    move-result-object v1

    invoke-virtual {p1}, Lj6/j$a;->a()Lq6/g;

    move-result-object p1

    invoke-virtual {p0}, Lj6/j;->m()Ll6/i0;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Ll6/k;-><init>(Ll6/e1;Lq6/g;Ll6/i0;)V

    return-object v0
.end method

.method protected f(Lj6/j$a;)Ll6/e1;
    .locals 7

    new-instance v4, Ll6/o;

    new-instance v0, Lp6/l0;

    invoke-virtual {p1}, Lj6/j$a;->c()Lj6/m;

    move-result-object v1

    invoke-virtual {v1}, Lj6/m;->a()Lm6/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lp6/l0;-><init>(Lm6/f;)V

    invoke-direct {v4, v0}, Ll6/o;-><init>(Lp6/l0;)V

    invoke-virtual {p1}, Lj6/j$a;->g()Lcom/google/firebase/firestore/a0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/a0;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll6/o0$b;->a(J)Ll6/o0$b;

    move-result-object v5

    new-instance v6, Ll6/z2;

    invoke-virtual {p1}, Lj6/j$a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lj6/j$a;->c()Lj6/m;

    move-result-object v0

    invoke-virtual {v0}, Lj6/m;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lj6/j$a;->c()Lj6/m;

    move-result-object p1

    invoke-virtual {p1}, Lj6/m;->a()Lm6/f;

    move-result-object v3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll6/z2;-><init>(Landroid/content/Context;Ljava/lang/String;Lm6/f;Ll6/o;Ll6/o0$b;)V

    return-object v6
.end method
