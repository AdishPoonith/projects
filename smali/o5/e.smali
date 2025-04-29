.class public final Lo5/e;
.super Lg5/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/e$b;
    }
.end annotation


# instance fields
.field private final a:Lo5/l;


# direct methods
.method public constructor <init>(Lo5/l;Lg5/x;)V
    .locals 0

    invoke-direct {p0}, Lg5/f;-><init>()V

    invoke-static {p1, p2}, Lo5/e;->b(Lo5/l;Lg5/x;)V

    iput-object p1, p0, Lo5/e;->a:Lo5/l;

    return-void
.end method

.method private static b(Lo5/l;Lg5/x;)V
    .locals 1

    sget-object v0, Lo5/e$a;->b:[I

    invoke-virtual {p0}, Lo5/l;->d()Lt5/y$c;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lg5/x;->b(Lg5/x;)Lg5/x;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lg5/t;
    .locals 4

    new-instance v0, Lo5/e$b;

    iget-object v1, p0, Lo5/e;->a:Lo5/l;

    invoke-virtual {v1}, Lo5/l;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo5/e;->a:Lo5/l;

    invoke-virtual {v2}, Lo5/l;->e()Lt5/i0;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo5/e$b;-><init>(Ljava/lang/String;Lt5/i0;Lo5/e$a;)V

    return-object v0
.end method
