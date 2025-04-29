.class public abstract Lu1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu1/g;


# instance fields
.field protected b:Lu1/g$a;

.field protected c:Lu1/g$a;

.field private d:Lu1/g$a;

.field private e:Lu1/g$a;

.field private f:Ljava/nio/ByteBuffer;

.field private g:Ljava/nio/ByteBuffer;

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu1/g;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/z;->f:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    sget-object v0, Lu1/g$a;->e:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->d:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->e:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->b:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->c:Lu1/g$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Lu1/z;->e:Lu1/g$a;

    sget-object v1, Lu1/g$a;->e:Lu1/g$a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Z
    .locals 2

    iget-boolean v0, p0, Lu1/z;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lu1/g;->a:Ljava/nio/ByteBuffer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    sget-object v1, Lu1/g;->a:Ljava/nio/ByteBuffer;

    iput-object v1, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/z;->h:Z

    invoke-virtual {p0}, Lu1/z;->j()V

    return-void
.end method

.method public final f(Lu1/g$a;)Lu1/g$a;
    .locals 0

    iput-object p1, p0, Lu1/z;->d:Lu1/g$a;

    invoke-virtual {p0, p1}, Lu1/z;->h(Lu1/g$a;)Lu1/g$a;

    move-result-object p1

    iput-object p1, p0, Lu1/z;->e:Lu1/g$a;

    invoke-virtual {p0}, Lu1/z;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu1/z;->e:Lu1/g$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lu1/g$a;->e:Lu1/g$a;

    :goto_0
    return-object p1
.end method

.method public final flush()V
    .locals 1

    sget-object v0, Lu1/g;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu1/z;->h:Z

    iget-object v0, p0, Lu1/z;->d:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->b:Lu1/g$a;

    iget-object v0, p0, Lu1/z;->e:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->c:Lu1/g$a;

    invoke-virtual {p0}, Lu1/z;->i()V

    return-void
.end method

.method protected final g()Z
    .locals 1

    iget-object v0, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    return v0
.end method

.method protected abstract h(Lu1/g$a;)Lu1/g$a;
.end method

.method protected i()V
    .locals 0

    return-void
.end method

.method protected j()V
    .locals 0

    return-void
.end method

.method protected k()V
    .locals 0

    return-void
.end method

.method protected final l(I)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lu1/z;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    if-ge v0, p1, :cond_0

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lu1/z;->f:Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lu1/z;->f:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :goto_0
    iget-object p1, p0, Lu1/z;->f:Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lu1/z;->g:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final reset()V
    .locals 1

    invoke-virtual {p0}, Lu1/z;->flush()V

    sget-object v0, Lu1/g;->a:Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lu1/z;->f:Ljava/nio/ByteBuffer;

    sget-object v0, Lu1/g$a;->e:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->d:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->e:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->b:Lu1/g$a;

    iput-object v0, p0, Lu1/z;->c:Lu1/g$a;

    invoke-virtual {p0}, Lu1/z;->k()V

    return-void
.end method
