.class public final Lha/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lha/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lha/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Lha/d;
    .locals 1

    new-instance v0, Lha/d;

    invoke-direct {v0, p1, p2, p3}, Lha/d;-><init>(III)V

    return-object v0
.end method
