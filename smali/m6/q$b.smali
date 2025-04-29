.class public abstract Lm6/q$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm6/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLm6/q$a;)Lm6/q$b;
    .locals 1

    new-instance v0, Lm6/c;

    invoke-direct {v0, p0, p1, p2}, Lm6/c;-><init>(JLm6/q$a;)V

    return-object v0
.end method

.method public static b(JLm6/w;Lm6/l;I)Lm6/q$b;
    .locals 0

    invoke-static {p2, p3, p4}, Lm6/q$a;->h(Lm6/w;Lm6/l;I)Lm6/q$a;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lm6/q$b;->a(JLm6/q$a;)Lm6/q$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c()Lm6/q$a;
.end method

.method public abstract d()J
.end method
