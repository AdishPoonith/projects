.class Lk9/a$d;
.super Lk9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic k:Lk9/a;


# direct methods
.method public constructor <init>(Lk9/a;Lm9/c;)V
    .locals 0

    iput-object p1, p0, Lk9/a$d;->k:Lk9/a;

    invoke-direct {p0, p2}, Lk9/c;-><init>(Lm9/c;)V

    return-void
.end method


# virtual methods
.method public F(Lm9/i;)V
    .locals 1

    iget-object v0, p0, Lk9/a$d;->k:Lk9/a;

    invoke-static {v0}, Lk9/a;->r(Lk9/a;)I

    invoke-super {p0, p1}, Lk9/c;->F(Lm9/i;)V

    return-void
.end method

.method public d(ILm9/a;)V
    .locals 1

    iget-object v0, p0, Lk9/a$d;->k:Lk9/a;

    invoke-static {v0}, Lk9/a;->r(Lk9/a;)I

    invoke-super {p0, p1, p2}, Lk9/c;->d(ILm9/a;)V

    return-void
.end method

.method public f(ZII)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lk9/a$d;->k:Lk9/a;

    invoke-static {v0}, Lk9/a;->r(Lk9/a;)I

    :cond_0
    invoke-super {p0, p1, p2, p3}, Lk9/c;->f(ZII)V

    return-void
.end method
