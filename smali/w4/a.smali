.class public final Lw4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lk4/b;


# direct methods
.method public constructor <init>(Lk4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk4/b;

    iput-object p1, p0, Lw4/a;->a:Lk4/b;

    return-void
.end method


# virtual methods
.method public final a()Lk4/b;
    .locals 1

    iget-object v0, p0, Lw4/a;->a:Lk4/b;

    return-object v0
.end method
