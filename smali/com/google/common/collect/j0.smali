.class Lcom/google/common/collect/j0;
.super Lcom/google/common/collect/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/q<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final n:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient l:[Ljava/lang/Object;

.field private final transient m:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/common/collect/j0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/google/common/collect/j0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/common/collect/j0;->n:Lcom/google/common/collect/q;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/common/collect/q;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/j0;->l:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/common/collect/j0;->m:I

    return-void
.end method


# virtual methods
.method e([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lcom/google/common/collect/j0;->l:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/common/collect/j0;->m:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/common/collect/j0;->m:I

    add-int/2addr p2, p1

    return p2
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lcom/google/common/collect/j0;->m:I

    invoke-static {p1, v0}, Lb5/n;->l(II)I

    iget-object v0, p0, Lcom/google/common/collect/j0;->l:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method k()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/common/collect/j0;->l:[Ljava/lang/Object;

    return-object v0
.end method

.method l()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/j0;->m:I

    return v0
.end method

.method m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/j0;->m:I

    return v0
.end method
