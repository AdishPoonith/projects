.class public abstract Lk2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lk2/e;)Lk2/a;
    .locals 2

    iget-object v0, p1, Lv1/g;->l:Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lp3/a;->a(Z)V

    invoke-virtual {p1}, Lv1/a;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, v0}, Lk2/h;->b(Lk2/e;Ljava/nio/ByteBuffer;)Lk2/a;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method protected abstract b(Lk2/e;Ljava/nio/ByteBuffer;)Lk2/a;
.end method
