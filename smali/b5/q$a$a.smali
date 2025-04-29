.class Lb5/q$a$a;
.super Lb5/q$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb5/q$a;->b(Lb5/q;Ljava/lang/CharSequence;)Lb5/q$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lb5/q$a;


# direct methods
.method constructor <init>(Lb5/q$a;Lb5/q;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lb5/q$a$a;->q:Lb5/q$a;

    invoke-direct {p0, p2, p3}, Lb5/q$b;-><init>(Lb5/q;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method f(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method g(I)I
    .locals 2

    iget-object v0, p0, Lb5/q$a$a;->q:Lb5/q$a;

    iget-object v0, v0, Lb5/q$a;->a:Lb5/c;

    iget-object v1, p0, Lb5/q$b;->l:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lb5/c;->c(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
