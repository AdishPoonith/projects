.class abstract Lb5/q$b;
.super Lb5/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb5/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final l:Ljava/lang/CharSequence;

.field final m:Lb5/c;

.field final n:Z

.field o:I

.field p:I


# direct methods
.method protected constructor <init>(Lb5/q;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-direct {p0}, Lb5/a;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb5/q$b;->o:I

    invoke-static {p1}, Lb5/q;->a(Lb5/q;)Lb5/c;

    move-result-object v0

    iput-object v0, p0, Lb5/q$b;->m:Lb5/c;

    invoke-static {p1}, Lb5/q;->b(Lb5/q;)Z

    move-result v0

    iput-boolean v0, p0, Lb5/q$b;->n:Z

    invoke-static {p1}, Lb5/q;->c(Lb5/q;)I

    move-result p1

    iput p1, p0, Lb5/q$b;->p:I

    iput-object p2, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method protected bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb5/q$b;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected e()Ljava/lang/String;
    .locals 6

    :goto_0
    iget v0, p0, Lb5/q$b;->o:I

    :cond_0
    :goto_1
    iget v1, p0, Lb5/q$b;->o:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_8

    invoke-virtual {p0, v1}, Lb5/q$b;->g(I)I

    move-result v1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lb5/q$b;->o:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1}, Lb5/q$b;->f(I)I

    move-result v3

    iput v3, p0, Lb5/q$b;->o:I

    :goto_2
    iget v3, p0, Lb5/q$b;->o:I

    if-ne v3, v0, :cond_2

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lb5/q$b;->o:I

    iget-object v1, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le v3, v1, :cond_0

    iput v2, p0, Lb5/q$b;->o:I

    goto :goto_1

    :cond_2
    :goto_3
    if-ge v0, v1, :cond_3

    iget-object v3, p0, Lb5/q$b;->m:Lb5/c;

    iget-object v4, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v4, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Lb5/c;->e(C)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    :goto_4
    if-le v1, v0, :cond_4

    iget-object v3, p0, Lb5/q$b;->m:Lb5/c;

    iget-object v4, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    add-int/lit8 v5, v1, -0x1

    invoke-interface {v4, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Lb5/c;->e(C)Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, -0x1

    goto :goto_4

    :cond_4
    iget-boolean v3, p0, Lb5/q$b;->n:Z

    if-eqz v3, :cond_5

    if-ne v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v3, p0, Lb5/q$b;->p:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    iget-object v1, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v2, p0, Lb5/q$b;->o:I

    :goto_5
    if-le v1, v0, :cond_7

    iget-object v2, p0, Lb5/q$b;->m:Lb5/c;

    iget-object v3, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    add-int/lit8 v4, v1, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v2, v3}, Lb5/c;->e(C)Z

    move-result v2

    if-eqz v2, :cond_7

    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    :cond_6
    sub-int/2addr v3, v4

    iput v3, p0, Lb5/q$b;->p:I

    :cond_7
    iget-object v2, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v2, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-virtual {p0}, Lb5/a;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method abstract f(I)I
.end method

.method abstract g(I)I
.end method
