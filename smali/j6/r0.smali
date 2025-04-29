.class public Lj6/r0;
.super Lj6/q;
.source "SourceFile"


# instance fields
.field private final d:Lm6/l;


# direct methods
.method constructor <init>(Lm6/r;Lj6/q$b;Ld7/b0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj6/q;-><init>(Lm6/r;Lj6/q$b;Ld7/b0;)V

    invoke-static {p3}, Lm6/y;->B(Ld7/b0;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "KeyFieldFilter expects a ReferenceValue"

    invoke-static {p1, p3, p2}, Lq6/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj6/q;->i()Ld7/b0;

    move-result-object p1

    invoke-virtual {p1}, Ld7/b0;->y0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm6/l;->k(Ljava/lang/String;)Lm6/l;

    move-result-object p1

    iput-object p1, p0, Lj6/r0;->d:Lm6/l;

    return-void
.end method


# virtual methods
.method public e(Lm6/i;)Z
    .locals 1

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object p1

    iget-object v0, p0, Lj6/r0;->d:Lm6/l;

    invoke-virtual {p1, v0}, Lm6/l;->g(Lm6/l;)I

    move-result p1

    invoke-virtual {p0, p1}, Lj6/q;->k(I)Z

    move-result p1

    return p1
.end method
