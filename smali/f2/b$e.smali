.class final Lf2/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lp3/a0;


# direct methods
.method public constructor <init>(Lf2/a$b;Ls1/n1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lf2/a$b;->b:Lp3/a0;

    iput-object p1, p0, Lf2/b$e;->c:Lp3/a0;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lp3/a0;->T(I)V

    invoke-virtual {p1}, Lp3/a0;->K()I

    move-result v0

    iget-object v1, p2, Ls1/n1;->u:Ljava/lang/String;

    const-string v2, "audio/raw"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p2, Ls1/n1;->J:I

    iget p2, p2, Ls1/n1;->H:I

    invoke-static {v1, p2}, Lp3/n0;->d0(II)I

    move-result p2

    if-eqz v0, :cond_0

    rem-int v1, v0, p2

    if-eqz v1, :cond_1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Audio sample size mismatch. stsd sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", stsz sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AtomParsers"

    invoke-static {v1, v0}, Lp3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    move v0, p2

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, -0x1

    :cond_2
    iput v0, p0, Lf2/b$e;->a:I

    invoke-virtual {p1}, Lp3/a0;->K()I

    move-result p1

    iput p1, p0, Lf2/b$e;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lf2/b$e;->a:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lf2/b$e;->b:I

    return v0
.end method

.method public c()I
    .locals 2

    iget v0, p0, Lf2/b$e;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lf2/b$e;->c:Lp3/a0;

    invoke-virtual {v0}, Lp3/a0;->K()I

    move-result v0

    :cond_0
    return v0
.end method
