.class final Lm6/b;
.super Lm6/q$a;
.source "SourceFile"


# instance fields
.field private final l:Lm6/w;

.field private final m:Lm6/l;

.field private final n:I


# direct methods
.method constructor <init>(Lm6/w;Lm6/l;I)V
    .locals 1

    invoke-direct {p0}, Lm6/q$a;-><init>()V

    const-string v0, "Null readTime"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lm6/b;->l:Lm6/w;

    const-string p1, "Null documentKey"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lm6/b;->m:Lm6/l;

    iput p3, p0, Lm6/b;->n:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm6/q$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lm6/q$a;

    iget-object v1, p0, Lm6/b;->l:Lm6/w;

    invoke-virtual {p1}, Lm6/q$a;->o()Lm6/w;

    move-result-object v3

    invoke-virtual {v1, v3}, Lm6/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm6/b;->m:Lm6/l;

    invoke-virtual {p1}, Lm6/q$a;->l()Lm6/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Lm6/l;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lm6/b;->n:I

    invoke-virtual {p1}, Lm6/q$a;->n()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lm6/b;->l:Lm6/w;

    invoke-virtual {v0}, Lm6/w;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget-object v2, p0, Lm6/b;->m:Lm6/l;

    invoke-virtual {v2}, Lm6/l;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget v1, p0, Lm6/b;->n:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public l()Lm6/l;
    .locals 1

    iget-object v0, p0, Lm6/b;->m:Lm6/l;

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lm6/b;->n:I

    return v0
.end method

.method public o()Lm6/w;
    .locals 1

    iget-object v0, p0, Lm6/b;->l:Lm6/w;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IndexOffset{readTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm6/b;->l:Lm6/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", documentKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm6/b;->m:Lm6/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", largestBatchId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm6/b;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
