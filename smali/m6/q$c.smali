.class public abstract Lm6/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm6/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm6/q$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lm6/q$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Lm6/r;Lm6/q$c$a;)Lm6/q$c;
    .locals 1

    new-instance v0, Lm6/d;

    invoke-direct {v0, p0, p1}, Lm6/d;-><init>(Lm6/r;Lm6/q$c$a;)V

    return-object v0
.end method


# virtual methods
.method public b(Lm6/q$c;)I
    .locals 2

    invoke-virtual {p0}, Lm6/q$c;->h()Lm6/r;

    move-result-object v0

    invoke-virtual {p1}, Lm6/q$c;->h()Lm6/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm6/e;->i(Lm6/e;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object v0

    invoke-virtual {p1}, Lm6/q$c;->i()Lm6/q$c$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lm6/q$c;

    invoke-virtual {p0, p1}, Lm6/q$c;->b(Lm6/q$c;)I

    move-result p1

    return p1
.end method

.method public abstract h()Lm6/r;
.end method

.method public abstract i()Lm6/q$c$a;
.end method
