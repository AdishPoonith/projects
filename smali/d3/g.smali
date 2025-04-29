.class public abstract Ld3/g;
.super Lv1/j;
.source "SourceFile"

# interfaces
.implements Ld3/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv1/j<",
        "Ld3/l;",
        "Ld3/m;",
        "Ld3/j;",
        ">;",
        "Ld3/i;"
    }
.end annotation


# instance fields
.field private final n:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v1, v0, [Ld3/l;

    new-array v0, v0, [Ld3/m;

    invoke-direct {p0, v1, v0}, Lv1/j;-><init>([Lv1/g;[Lv1/h;)V

    iput-object p1, p0, Ld3/g;->n:Ljava/lang/String;

    const/16 p1, 0x400

    invoke-virtual {p0, p1}, Lv1/j;->v(I)V

    return-void
.end method

.method static synthetic w(Ld3/g;Lv1/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv1/j;->s(Lv1/h;)V

    return-void
.end method


# virtual methods
.method protected abstract A([BIZ)Ld3/h;
.end method

.method protected final B(Ld3/l;Ld3/m;Z)Ld3/j;
    .locals 8

    :try_start_0
    iget-object v0, p1, Lv1/g;->l:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p0, v1, v0, p3}, Ld3/g;->A([BIZ)Ld3/h;

    move-result-object v5

    iget-wide v3, p1, Lv1/g;->n:J

    iget-wide v6, p1, Ld3/l;->r:J

    move-object v2, p2

    invoke-virtual/range {v2 .. v7}, Ld3/m;->x(JLd3/h;J)V

    const/high16 p1, -0x80000000

    invoke-virtual {p2, p1}, Lv1/a;->n(I)V
    :try_end_0
    .catch Ld3/j; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    return-object p1
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method protected bridge synthetic h()Lv1/g;
    .locals 1

    invoke-virtual {p0}, Ld3/g;->x()Ld3/l;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic i()Lv1/h;
    .locals 1

    invoke-virtual {p0}, Ld3/g;->y()Ld3/m;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic j(Ljava/lang/Throwable;)Lv1/f;
    .locals 0

    invoke-virtual {p0, p1}, Ld3/g;->z(Ljava/lang/Throwable;)Ld3/j;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic k(Lv1/g;Lv1/h;Z)Lv1/f;
    .locals 0

    check-cast p1, Ld3/l;

    check-cast p2, Ld3/m;

    invoke-virtual {p0, p1, p2, p3}, Ld3/g;->B(Ld3/l;Ld3/m;Z)Ld3/j;

    move-result-object p1

    return-object p1
.end method

.method protected final x()Ld3/l;
    .locals 1

    new-instance v0, Ld3/l;

    invoke-direct {v0}, Ld3/l;-><init>()V

    return-object v0
.end method

.method protected final y()Ld3/m;
    .locals 1

    new-instance v0, Ld3/g$a;

    invoke-direct {v0, p0}, Ld3/g$a;-><init>(Ld3/g;)V

    return-object v0
.end method

.method protected final z(Ljava/lang/Throwable;)Ld3/j;
    .locals 2

    new-instance v0, Ld3/j;

    const-string v1, "Unexpected decode error"

    invoke-direct {v0, v1, p1}, Ld3/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method
