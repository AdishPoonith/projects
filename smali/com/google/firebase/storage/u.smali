.class public Lcom/google/firebase/storage/u;
.super Lcom/google/firebase/storage/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/storage/u$d;,
        Lcom/google/firebase/storage/u$c;,
        Lcom/google/firebase/storage/u$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/storage/s<",
        "Lcom/google/firebase/storage/u$d;",
        ">;"
    }
.end annotation


# instance fields
.field private l:Lcom/google/firebase/storage/l;

.field private m:Lx6/c;

.field private volatile n:Ljava/lang/Exception;

.field private volatile o:I

.field private p:Lcom/google/firebase/storage/u$b;

.field private q:J

.field private r:J

.field private s:J

.field private t:Ljava/io/InputStream;

.field private u:Ly6/e;

.field private v:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/l;)V
    .locals 7

    invoke-direct {p0}, Lcom/google/firebase/storage/s;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/firebase/storage/u;->o:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/firebase/storage/u;->q:J

    iput-object p1, p0, Lcom/google/firebase/storage/u;->l:Lcom/google/firebase/storage/l;

    invoke-virtual {p1}, Lcom/google/firebase/storage/l;->v()Lcom/google/firebase/storage/d;

    move-result-object p1

    new-instance v6, Lx6/c;

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->a()Lw5/f;

    move-result-object v0

    invoke-virtual {v0}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->c()La6/b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->b()Lz5/b;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/storage/d;->j()J

    move-result-wide v4

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lx6/c;-><init>(Landroid/content/Context;La6/b;Lz5/b;J)V

    iput-object v6, p0, Lcom/google/firebase/storage/u;->m:Lx6/c;

    return-void
.end method

.method static synthetic l0(Lcom/google/firebase/storage/u;)Ljava/io/InputStream;
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/storage/u;->o0()Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method static synthetic m0(Lcom/google/firebase/storage/u;)Ly6/e;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    return-object p0
.end method

.method static synthetic n0(Lcom/google/firebase/storage/u;Ly6/e;)Ly6/e;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    return-object p1
.end method

.method private o0()Ljava/io/InputStream;
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/storage/u;->m:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->c()V

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly6/e;->D()V

    :cond_0
    new-instance v0, Ly6/c;

    iget-object v1, p0, Lcom/google/firebase/storage/u;->l:Lcom/google/firebase/storage/l;

    invoke-virtual {v1}, Lcom/google/firebase/storage/l;->w()Lx6/h;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/u;->l:Lcom/google/firebase/storage/l;

    invoke-virtual {v2}, Lcom/google/firebase/storage/l;->k()Lw5/f;

    move-result-object v2

    iget-wide v3, p0, Lcom/google/firebase/storage/u;->r:J

    invoke-direct {v0, v1, v2, v3, v4}, Ly6/c;-><init>(Lx6/h;Lw5/f;J)V

    iput-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    iget-object v1, p0, Lcom/google/firebase/storage/u;->m:Lx6/c;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lx6/c;->e(Ly6/e;Z)V

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    invoke-virtual {v0}, Ly6/e;->p()I

    move-result v0

    iput v0, p0, Lcom/google/firebase/storage/u;->o:I

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    invoke-virtual {v0}, Ly6/e;->f()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    invoke-virtual {v0}, Ly6/e;->f()Ljava/lang/Exception;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    :goto_0
    iput-object v0, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    iget v0, p0, Lcom/google/firebase/storage/u;->o:I

    invoke-direct {p0, v0}, Lcom/google/firebase/storage/u;->p0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->B()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    const-string v1, "ETag"

    invoke-virtual {v0, v1}, Ly6/e;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/google/firebase/storage/u;->v:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v0, 0x199

    iput v0, p0, Lcom/google/firebase/storage/u;->o:I

    new-instance v0, Ljava/io/IOException;

    const-string v1, "The ETag on the server changed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iput-object v0, p0, Lcom/google/firebase/storage/u;->v:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    invoke-virtual {v0}, Ly6/e;->s()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/google/firebase/storage/u;->r:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/firebase/storage/u;->q:J

    iget-object v0, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    invoke-virtual {v0}, Ly6/e;->u()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Could not open resulting stream."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private p0(I)Z
    .locals 1

    const/16 v0, 0x134

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method I()Lcom/google/firebase/storage/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/u;->l:Lcom/google/firebase/storage/l;

    return-object v0
.end method

.method protected U()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/u;->m:Lx6/c;

    invoke-virtual {v0}, Lx6/c;->a()V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lcom/google/firebase/storage/j;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/firebase/storage/j;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    return-void
.end method

.method protected X()V
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/storage/u;->r:J

    iput-wide v0, p0, Lcom/google/firebase/storage/u;->s:J

    return-void
.end method

.method public a0()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d0()Z
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "this operation is not supported on StreamDownloadTask."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method e0()V
    .locals 7

    const-string v0, "StreamDownloadTask"

    iget-object v1, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    const/16 v2, 0x40

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2, v3}, Lcom/google/firebase/storage/s;->j0(IZ)Z

    return-void

    :cond_0
    const/4 v1, 0x4

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/storage/s;->j0(IZ)Z

    move-result v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    new-instance v4, Lcom/google/firebase/storage/u$c;

    new-instance v5, Lcom/google/firebase/storage/u$a;

    invoke-direct {v5, p0}, Lcom/google/firebase/storage/u$a;-><init>(Lcom/google/firebase/storage/u;)V

    invoke-direct {v4, v5, p0}, Lcom/google/firebase/storage/u$c;-><init>(Ljava/util/concurrent/Callable;Lcom/google/firebase/storage/u;)V

    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-direct {v5, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v5, p0, Lcom/google/firebase/storage/u;->t:Ljava/io/InputStream;

    :try_start_0
    invoke-static {v4}, Lcom/google/firebase/storage/u$c;->a(Lcom/google/firebase/storage/u$c;)Z

    iget-object v4, p0, Lcom/google/firebase/storage/u;->p:Lcom/google/firebase/storage/u$b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v4, :cond_2

    :try_start_1
    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->g0()Lcom/google/firebase/storage/s$a;

    move-result-object v5

    check-cast v5, Lcom/google/firebase/storage/u$d;

    iget-object v6, p0, Lcom/google/firebase/storage/u;->t:Ljava/io/InputStream;

    invoke-interface {v4, v5, v6}, Lcom/google/firebase/storage/u$b;->a(Lcom/google/firebase/storage/u$d;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    :try_start_2
    const-string v5, "Exception occurred calling doInBackground."

    invoke-static {v0, v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v4, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v5, "Initial opening of Stream failed"

    invoke-static {v0, v5, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iput-object v4, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    :cond_2
    :goto_0
    iget-object v4, p0, Lcom/google/firebase/storage/u;->t:Ljava/io/InputStream;

    if-nez v4, :cond_3

    iget-object v4, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    invoke-virtual {v4}, Ly6/e;->D()V

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/google/firebase/storage/u;->u:Ly6/e;

    :cond_3
    iget-object v4, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    if-nez v4, :cond_4

    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->B()I

    move-result v4

    if-ne v4, v1, :cond_4

    const/4 v4, 0x1

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_5

    invoke-virtual {p0, v1, v3}, Lcom/google/firebase/storage/s;->j0(IZ)Z

    const/16 v0, 0x80

    invoke-virtual {p0, v0, v3}, Lcom/google/firebase/storage/s;->j0(IZ)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->B()I

    move-result v1

    const/16 v4, 0x20

    if-ne v1, v4, :cond_6

    const/16 v2, 0x100

    :cond_6
    invoke-virtual {p0, v2, v3}, Lcom/google/firebase/storage/s;->j0(IZ)Z

    move-result v1

    if-nez v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to change download task to final state from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->B()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_2
    return-void
.end method

.method protected f0()V
    .locals 2

    invoke-static {}, Lw6/m;->b()Lw6/m;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->E()Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw6/m;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method bridge synthetic h0()Lcom/google/firebase/storage/s$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/u;->s0()Lcom/google/firebase/storage/u$d;

    move-result-object v0

    return-object v0
.end method

.method q0(J)V
    .locals 4

    iget-wide v0, p0, Lcom/google/firebase/storage/u;->r:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/google/firebase/storage/u;->r:J

    iget-wide p1, p0, Lcom/google/firebase/storage/u;->s:J

    const-wide/32 v2, 0x40000

    add-long/2addr p1, v2

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/storage/s;->B()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lcom/google/firebase/storage/s;->j0(IZ)Z

    goto :goto_0

    :cond_0
    iget-wide p1, p0, Lcom/google/firebase/storage/u;->r:J

    iput-wide p1, p0, Lcom/google/firebase/storage/u;->s:J

    :cond_1
    :goto_0
    return-void
.end method

.method r0(Lcom/google/firebase/storage/u$b;)Lcom/google/firebase/storage/u;
    .locals 1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/storage/u;->p:Lcom/google/firebase/storage/u$b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lc4/s;->l(Z)V

    iput-object p1, p0, Lcom/google/firebase/storage/u;->p:Lcom/google/firebase/storage/u$b;

    return-object p0
.end method

.method s0()Lcom/google/firebase/storage/u$d;
    .locals 4

    new-instance v0, Lcom/google/firebase/storage/u$d;

    iget-object v1, p0, Lcom/google/firebase/storage/u;->n:Ljava/lang/Exception;

    iget v2, p0, Lcom/google/firebase/storage/u;->o:I

    invoke-static {v1, v2}, Lcom/google/firebase/storage/j;->e(Ljava/lang/Throwable;I)Lcom/google/firebase/storage/j;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/firebase/storage/u;->s:J

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/firebase/storage/u$d;-><init>(Lcom/google/firebase/storage/u;Ljava/lang/Exception;J)V

    return-object v0
.end method
