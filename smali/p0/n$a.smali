.class public final Lp0/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lp0/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp0/n$a;

    invoke-direct {v0}, Lp0/n$a;-><init>()V

    sput-object v0, Lp0/n$a;->a:Lp0/n$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lp0/n;
    .locals 1

    new-instance v0, Lf1/d;

    invoke-direct {v0}, Lf1/d;-><init>()V

    return-object v0
.end method
