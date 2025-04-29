.class public final Lv5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lv5/a;


# direct methods
.method private constructor <init>(Lv5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/b;->a:Lv5/a;

    return-void
.end method

.method public static a([BLg5/x;)Lv5/b;
    .locals 1

    const-string v0, "SecretKeyAccess required"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance p1, Lv5/b;

    invoke-static {p0}, Lv5/a;->a([B)Lv5/a;

    move-result-object p0

    invoke-direct {p1, p0}, Lv5/b;-><init>(Lv5/a;)V

    return-object p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Lv5/b;->a:Lv5/a;

    invoke-virtual {v0}, Lv5/a;->c()I

    move-result v0

    return v0
.end method
