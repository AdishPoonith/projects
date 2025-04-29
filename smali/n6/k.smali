.class public abstract Ln6/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILn6/f;)Ln6/k;
    .locals 1

    new-instance v0, Ln6/b;

    invoke-direct {v0, p0, p1}, Ln6/b;-><init>(ILn6/f;)V

    return-object v0
.end method


# virtual methods
.method public b()Lm6/l;
    .locals 1

    invoke-virtual {p0}, Ln6/k;->d()Ln6/f;

    move-result-object v0

    invoke-virtual {v0}, Ln6/f;->g()Lm6/l;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()I
.end method

.method public abstract d()Ln6/f;
.end method
