.class final Lm6/d;
.super Lm6/q$c;
.source "SourceFile"


# instance fields
.field private final j:Lm6/r;

.field private final k:Lm6/q$c$a;


# direct methods
.method constructor <init>(Lm6/r;Lm6/q$c$a;)V
    .locals 1

    invoke-direct {p0}, Lm6/q$c;-><init>()V

    const-string v0, "Null fieldPath"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lm6/d;->j:Lm6/r;

    const-string p1, "Null kind"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lm6/d;->k:Lm6/q$c$a;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm6/q$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lm6/q$c;

    iget-object v1, p0, Lm6/d;->j:Lm6/r;

    invoke-virtual {p1}, Lm6/q$c;->h()Lm6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lm6/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm6/d;->k:Lm6/q$c$a;

    invoke-virtual {p1}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public h()Lm6/r;
    .locals 1

    iget-object v0, p0, Lm6/d;->j:Lm6/r;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lm6/d;->j:Lm6/r;

    invoke-virtual {v0}, Lm6/e;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget-object v1, p0, Lm6/d;->k:Lm6/q$c$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public i()Lm6/q$c$a;
    .locals 1

    iget-object v0, p0, Lm6/d;->k:Lm6/q$c$a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Segment{fieldPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm6/d;->j:Lm6/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", kind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm6/d;->k:Lm6/q$c$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
