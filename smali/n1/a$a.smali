.class public final Ln1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ln1/a$a;

.field private static b:Ln1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln1/a$a;

    invoke-direct {v0}, Ln1/a$a;-><init>()V

    sput-object v0, Ln1/a$a;->a:Ln1/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln1/a;
    .locals 1

    sget-object v0, Ln1/a$a;->b:Ln1/a;

    return-object v0
.end method
