.class public abstract Lcom/google/common/collect/b;
.super Lcom/google/common/collect/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/common/collect/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/s0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private j:Lcom/google/common/collect/b$b;

.field private k:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/common/collect/s0;-><init>()V

    sget-object v0, Lcom/google/common/collect/b$b;->k:Lcom/google/common/collect/b$b;

    iput-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    return-void
.end method

.method private d()Z
    .locals 2

    sget-object v0, Lcom/google/common/collect/b$b;->m:Lcom/google/common/collect/b$b;

    iput-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    invoke-virtual {p0}, Lcom/google/common/collect/b;->a()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/collect/b;->k:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    sget-object v1, Lcom/google/common/collect/b$b;->l:Lcom/google/common/collect/b$b;

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/common/collect/b$b;->j:Lcom/google/common/collect/b$b;

    iput-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected abstract a()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method protected final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/common/collect/b$b;->l:Lcom/google/common/collect/b$b;

    iput-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 4

    iget-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    sget-object v1, Lcom/google/common/collect/b$b;->m:Lcom/google/common/collect/b$b;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lb5/n;->t(Z)V

    sget-object v0, Lcom/google/common/collect/b$a;->a:[I

    iget-object v1, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v3, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-direct {p0}, Lcom/google/common/collect/b;->d()Z

    move-result v0

    return v0

    :cond_1
    return v3

    :cond_2
    return v2
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/common/collect/b$b;->k:Lcom/google/common/collect/b$b;

    iput-object v0, p0, Lcom/google/common/collect/b;->j:Lcom/google/common/collect/b$b;

    iget-object v0, p0, Lcom/google/common/collect/b;->k:Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/common/collect/f0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/common/collect/b;->k:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
